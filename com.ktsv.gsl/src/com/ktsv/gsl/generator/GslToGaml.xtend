package com.ktsv.gsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.emf.ecore.EObject

class GslToGaml implements IGenerator{
 	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
        for (EObject o : resource.contents) {
           // o.compile(fsa)
        }
    }
 /* 
    def dispatch void compile(Model m, IFileSystemAccess fsa) {
        for (e : m.elements) {
            e.compile(fsa)
        }
    }
 
    def compile(Element e, IFileSystemAccess fsa) {
        fsa.generateFile(e.name+".gaml", '''
        this is element «e.name»
        ''')
    }
 
    def dispatch void compile(EObject m, IFileSystemAccess fsa) { }
				
		*/	
				
}