package org.xtext.example.mydsl1.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl1.myDsl.Cypher
import org.xtext.example.mydsl1.myDsl.Statement
import java.util.ArrayList
import java.io.File
import java.util.List
import java.io.FileInputStream
import java.io.BufferedReader
import java.io.InputStreamReader
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl
import java.util.HashMap
import org.eclipse.emf.common.util.URI
import org.xtext.example.mydsl1.tests.MyDslInjectorProvider

@ExtendWith(InjectionExtension)
@InjectWith(MyDslInjectorProvider)
class CypherParsingTest {
	@Inject
	ParseHelper<Cypher> parseHelper
	
	@Test
	def void loadModel() {
		val folder = "/Users/fibersel/coursework/trasnform-tests/resources/Cypher"
		
		var filelist = new ArrayList<File>()
		getFileList(filelist, folder)
		val saveOptions = new HashMap<String, String>();
		saveOptions.put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING,"UTF-8");
		
		for (file : filelist) {
			var filepath = file.getPath()
			println(filepath)
			val result = parseHelper.parse(readFile(filepath))
			if (result !== null) {
				var errors = result.eResource.errors
				
				val xmiResource = new XMIResourceImpl(URI.createURI(folder + "/" + file.getName().replace(".cypher", "") + ".xmi"))
				xmiResource.getContents().add(result.eResource.getContents().get(0));
				println(folder + "/" + file.getName().replace(".cypher", "") + ".xmi")
				xmiResource.save(saveOptions)
				for (Statement s: result.getStatements()) {
					println(s.toString())
				}
				if (errors.isEmpty()) {
					println("ok")
				}
			}
		}
	}
	
		
	def String readFile(String filePath){
		var buffer = new StringBuffer()
        var is = new FileInputStream(filePath);
        var reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        var line = reader.readLine();
        while (line !== null) {
            buffer.append(line);
            buffer.append("\r\n");
            line = reader.readLine();
        }
        reader.close();
        is.close();
        return buffer.toString()
    }
	
	def void getFileList(List<File> filelist, String strPath) {
		var dir = new File(strPath);
		var files = dir.listFiles();
		if (files !== null) {
			for (file : files) {
				var fileName = file.getName();
				if (file.isDirectory()) {
					getFileList(filelist, file.getAbsolutePath());
				} else if (fileName.endsWith(".cypher")) {
					filelist.add(file);
				}
			}
		}
	}
}