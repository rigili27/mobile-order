package b4a.bitdesing.tomapedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_orders_layout{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lblorderid").vw.setLeft((int)(0d));
views.get("lblorderid").vw.setWidth((int)((15d / 100 * width) - (0d)));
views.get("lblcustomer").vw.setLeft((int)((15d / 100 * width)));
views.get("lblcustomer").vw.setWidth((int)((75d / 100 * width) - ((15d / 100 * width))));
views.get("lbltotalorder").vw.setLeft((int)((75d / 100 * width)));
views.get("lbltotalorder").vw.setWidth((int)((100d / 100 * width) - ((75d / 100 * width))));

}
}