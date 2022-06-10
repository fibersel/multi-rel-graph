import textx
from textx import metamodel_from_file

from pyecore.resources.xmi import XMIResource
from pyecore.resources import URI

textx.enable_pyecore_support()

sample = """
    SELECT col1, col2
    FROM table
"""

mm = metamodel_from_file("sql.xtext")

model = mm.model_from_str(sample)

resource = XMIResource(URI('sql/sql_metamodel.ecore'))
resource.append(mm) 
resource.save() 

resource = XMIResource(URI('sql/sql_model.xmi'))
resource.append(model) 
resource.save() 

select = model.statements[0]
print(select.expressions)