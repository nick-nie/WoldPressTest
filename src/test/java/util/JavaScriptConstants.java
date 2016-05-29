package util;

/**
 * Created by Administrator on 2016/5/29 0029.
 */
public final class JavaScriptConstants
{

    public static final String JS_GET_SCROLLBAR_WIDTH = "document.body.style.overflow = 'hidden'; "
            + "var width = document.body.clientWidth; "
            + "document.body.style.overflow = 'scroll'; "
            + "width -= document.body.clientWidth; "
            + "if(!width) width = document.body.offsetWidth - document.body.clientWidth; "
            + "document.body.style.overflow = ''; "
            + "return width;";

    private JavaScriptConstants()
    {
    }

}
