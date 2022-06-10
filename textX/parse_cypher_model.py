from textx import metamodel_from_file
import textx
import importlib
import sys

from pyecore.resources.xmi import XMIResource
from pyecore.resources import URI

textx.enable_pyecore_support()

sample = """
    MATCH (:orders) RETURN COUNT(*)
"""


metamodel = textx.metamodel_from_file("cypher_draft.xtext")

model = metamodel.model_from_str(sample)

resource = XMIResource(URI('cypher/cypher_metamodel.ecore'))
resource.append(metamodel) 
resource.save() 


resource = XMIResource(URI('cypher/cypher_model.xmi'))
resource.append(model) 
resource.save() 

query = model.queries[0]
print(model)
