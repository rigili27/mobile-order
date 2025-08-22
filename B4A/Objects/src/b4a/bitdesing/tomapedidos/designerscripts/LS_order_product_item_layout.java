package b4a.bitdesing.tomapedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_order_product_item_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("lblquantity").vw.setLeft((int)(0d));
views.get("lblquantity").vw.setWidth((int)((7d / 100 * width) - (0d)));
views.get("lblproduct").vw.setLeft((int)((7d / 100 * width)));
views.get("lblproduct").vw.setWidth((int)((55d / 100 * width) - ((7d / 100 * width))));
views.get("lblpriceproduct").vw.setLeft((int)((55d / 100 * width)));
views.get("lblpriceproduct").vw.setWidth((int)((70d / 100 * width) - ((55d / 100 * width))));
views.get("lbloffproduct").vw.setLeft((int)((70d / 100 * width)));
views.get("lbloffproduct").vw.setWidth((int)((85d / 100 * width) - ((70d / 100 * width))));
//BA.debugLineNum = 15;BA.debugLine="lblPriceItem.SetLeftAndRight(85%x, 100%x)"[order_product_item_layout/General script]
views.get("lblpriceitem").vw.setLeft((int)((85d / 100 * width)));
views.get("lblpriceitem").vw.setWidth((int)((100d / 100 * width) - ((85d / 100 * width))));

}
}