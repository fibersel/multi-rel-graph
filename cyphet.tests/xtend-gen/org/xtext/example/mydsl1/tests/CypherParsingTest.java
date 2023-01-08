package org.xtext.example.mydsl1.tests;

import com.google.inject.Inject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl1.myDsl.Cypher;
import org.xtext.example.mydsl1.myDsl.Statement;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class CypherParsingTest {
  @Inject
  private ParseHelper<Cypher> parseHelper;

  @Test
  public void loadModel() {
    try {
      final String folder = "/Users/fibersel/coursework/trasnform-tests/resources/Cypher";
      ArrayList<File> filelist = new ArrayList<File>();
      this.getFileList(filelist, folder);
      final HashMap<String, String> saveOptions = new HashMap<String, String>();
      saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");
      for (final File file : filelist) {
        {
          String filepath = file.getPath();
          InputOutput.<String>println(filepath);
          final Cypher result = this.parseHelper.parse(this.readFile(filepath));
          if ((result != null)) {
            EList<Resource.Diagnostic> errors = result.eResource().getErrors();
            String _replace = file.getName().replace(".cypher", "");
            String _plus = ((folder + "/") + _replace);
            String _plus_1 = (_plus + ".xmi");
            URI _createURI = URI.createURI(_plus_1);
            final XMIResourceImpl xmiResource = new XMIResourceImpl(_createURI);
            xmiResource.getContents().add(result.eResource().getContents().get(0));
            String _replace_1 = file.getName().replace(".cypher", "");
            String _plus_2 = ((folder + "/") + _replace_1);
            String _plus_3 = (_plus_2 + ".xmi");
            InputOutput.<String>println(_plus_3);
            xmiResource.save(saveOptions);
            EList<Statement> _statements = result.getStatements();
            for (final Statement s : _statements) {
              InputOutput.<String>println(s.toString());
            }
            boolean _isEmpty = errors.isEmpty();
            if (_isEmpty) {
              InputOutput.<String>println("ok");
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public String readFile(final String filePath) {
    try {
      StringBuffer buffer = new StringBuffer();
      FileInputStream is = new FileInputStream(filePath);
      InputStreamReader _inputStreamReader = new InputStreamReader(is, "UTF-8");
      BufferedReader reader = new BufferedReader(_inputStreamReader);
      String line = reader.readLine();
      while ((line != null)) {
        {
          buffer.append(line);
          buffer.append("\r\n");
          line = reader.readLine();
        }
      }
      reader.close();
      is.close();
      return buffer.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  public void getFileList(final List<File> filelist, final String strPath) {
    File dir = new File(strPath);
    File[] files = dir.listFiles();
    if ((files != null)) {
      for (final File file : files) {
        {
          String fileName = file.getName();
          boolean _isDirectory = file.isDirectory();
          if (_isDirectory) {
            this.getFileList(filelist, file.getAbsolutePath());
          } else {
            boolean _endsWith = fileName.endsWith(".cypher");
            if (_endsWith) {
              filelist.add(file);
            }
          }
        }
      }
    }
  }
}
