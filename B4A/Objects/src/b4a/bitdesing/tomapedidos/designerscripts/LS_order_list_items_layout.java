package b4a.bitdesing.tomapedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_order_list_items_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("lblquantitytitle").vw.setLeft((int)(0d));
views.get("lblquantitytitle").vw.setWidth((int)((7d / 100 * width) - (0d)));
views.get("lblproducttitle").vw.setLeft((int)((7d / 100 * width)));
views.get("lblproducttitle").vw.setWidth((int)((55d / 100 * width) - ((7d / 100 * width))));
//BA.debugLineNum = 7;BA.debugLine="lblPriceProductTitle.SetLeftAndRight(55%x, 70%x)"[order_list_items_layout/General script]
views.get("lblpriceproducttitle").vw.setLeft((int)((55d / 100 * width)));
views.get("lblpriceproducttitle").vw.setWidth((int)((70d / 100 * width) - ((55d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="lblOffProductTitle.SetLeftAndRight(70%x, 85%x)"[order_list_items_layout/General script]
views.get("lbloffproducttitle").vw.setLeft((int)((70d / 100 * width)));
views.get("lbloffproducttitle").vw.setWidth((int)((85d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="lblPriceItemTitle.SetLeftAndRight(85%x, 100%x)"[order_list_items_layout/General script]
views.get("lblpriceitemtitle").vw.setLeft((int)((85d / 100 * width)));
views.get("lblpriceitemtitle").vw.setWidth((int)((100d / 100 * width) - ((85d / 100 * width))));

}
}