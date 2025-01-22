package b4a.bitdesing.tomapedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_products_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("fondooscuro").vw.setLeft((int)(0d));
views.get("fondooscuro").vw.setTop((int)(0d));
views.get("paneldetailproduct").vw.setLeft((int)((50d / 100 * width) - (views.get("paneldetailproduct").vw.getWidth() / 2)));
//BA.debugLineNum = 7;BA.debugLine="PanelDetailProduct.VerticalCenter = 50%y"[products_layout/General script]
views.get("paneldetailproduct").vw.setTop((int)((50d / 100 * height) - (views.get("paneldetailproduct").vw.getHeight() / 2)));

}
}