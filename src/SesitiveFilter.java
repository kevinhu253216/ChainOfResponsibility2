public class SesitiveFilter  implements Filter{

    public String doFilter(String str){
        String r = str.replace("被就业","就业").replace("敏感","");
        return r;
    }

}
