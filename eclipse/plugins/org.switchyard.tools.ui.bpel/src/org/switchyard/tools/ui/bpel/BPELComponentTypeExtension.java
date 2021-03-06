/******************************************************************************* 
 * Copyright (c) 2013 Red Hat, Inc. 
 *  All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 *
 ******************************************************************************/
package org.switchyard.tools.ui.bpel;

import java.util.Collections;
import java.util.List;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.tb.IImageDecorator;
import org.eclipse.graphiti.tb.ImageDecorator;
import org.eclipse.soa.sca.sca1_1.model.sca.Implementation;
import org.open.oasis.docs.ns.opencsa.sca.bpel.BPELImplementation;
import org.switchyard.tools.ui.editor.IComponentTypeExtension;
import org.switchyard.tools.ui.editor.ImageProvider;
import org.switchyard.tools.ui.editor.diagram.component.CreateComponentFeature;
import org.switchyard.tools.ui.editor.diagram.implementation.CreateImplementationFeature;
import org.switchyard.tools.ui.editor.diagram.shared.CompositeCreateFeature;

/**
 * BPELComponentTypeExtension
 * 
 * <p/>
 * Provides support for BPM components in the SwitchYard editor.
 */
public class BPELComponentTypeExtension implements IComponentTypeExtension {

    @Override
    public ICreateFeature[] newCreateFeatures(IFeatureProvider fp) {
        return new ICreateFeature[] {new CompositeCreateFeature(fp, "Process (BPEL)",
                "A BPEL process based component/implementation.", new CreateComponentFeature(fp,
                        new BPELComponentFactory(), "Process (BPEL)",
                        "Create a component implemented as a BPEL process.", ImageProvider.IMG_16_BPMN),
                new CreateImplementationFeature(fp, new BPELImplementationFactory(), "Process (BPEL)",
                        "An implementation using a BPEL process.")) };
    }

    @Override
    public IImageDecorator getImageDecorator(Implementation implementation) {
        return new ImageDecorator(ImageProvider.IMG_16_BPMN);
    }

    @Override
    public boolean supports(Class<? extends Implementation> type) {
        return BPELImplementation.class.isAssignableFrom(type);
    }


    @Override
    public List<String> getRequiredCapabilities(Implementation object) {
        return Collections.singletonList("org.switchyard.components:switchyard-component-bpel");
    }
}
