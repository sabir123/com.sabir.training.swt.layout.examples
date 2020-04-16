package com.sabir.training.swt.layout.examples;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	@Override	
	public void createInitialLayout(IPageLayout layout) {
		
		String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(false);
        layout.setFixed(true);
		layout.addView(CompositeView.VIEW_ID, IPageLayout.TOP,
                IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}
