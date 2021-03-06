/**
 * generated by Xtext 2.21.0
 */
package com.ktsv.gsl.formatting2;

import com.google.inject.Inject;
import com.ktsv.gsl.services.GslGrammarAccess;
import gamamodel.ExperimentBlock;
import gamamodel.Gamamodel;
import gamamodel.GlobalBlock;
import gamamodel.GlobalVariable;
import gamamodel.SpatialEntity;
import gamamodel.SpecieBlock;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class GslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private GslGrammarAccess _gslGrammarAccess;
  
  protected void _format(final Gamamodel gamamodel, @Extension final IFormattableDocument document) {
    document.<GlobalBlock>format(gamamodel.getContainsglobal());
    EList<SpecieBlock> _containsspecie = gamamodel.getContainsspecie();
    for (final SpecieBlock specieBlock : _containsspecie) {
      document.<SpecieBlock>format(specieBlock);
    }
    EList<ExperimentBlock> _containsexperiment = gamamodel.getContainsexperiment();
    for (final ExperimentBlock experimentBlock : _containsexperiment) {
      document.<ExperimentBlock>format(experimentBlock);
    }
  }
  
  protected void _format(final GlobalBlock globalBlock, @Extension final IFormattableDocument document) {
    EList<GlobalVariable> _containsglobalvariable = globalBlock.getContainsglobalvariable();
    for (final GlobalVariable globalVariable : _containsglobalvariable) {
      document.<GlobalVariable>format(globalVariable);
    }
    EList<SpatialEntity> _hasspatialentity = globalBlock.getHasspatialentity();
    for (final SpatialEntity spatialEntity : _hasspatialentity) {
      document.<SpatialEntity>format(spatialEntity);
    }
  }
  
  public void format(final Object gamamodel, final IFormattableDocument document) {
    if (gamamodel instanceof XtextResource) {
      _format((XtextResource)gamamodel, document);
      return;
    } else if (gamamodel instanceof Gamamodel) {
      _format((Gamamodel)gamamodel, document);
      return;
    } else if (gamamodel instanceof GlobalBlock) {
      _format((GlobalBlock)gamamodel, document);
      return;
    } else if (gamamodel instanceof EObject) {
      _format((EObject)gamamodel, document);
      return;
    } else if (gamamodel == null) {
      _format((Void)null, document);
      return;
    } else if (gamamodel != null) {
      _format(gamamodel, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(gamamodel, document).toString());
    }
  }
}
