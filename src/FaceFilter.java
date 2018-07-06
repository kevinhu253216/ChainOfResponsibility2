public class FaceFilter implements Filter{

    public String doFilter(String str){
        return str.replace(":)","^V^");
    }
}
