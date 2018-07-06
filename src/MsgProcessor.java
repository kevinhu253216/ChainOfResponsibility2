public class MsgProcessor {

    private String msg;

    public String getMsg(){
        return msg;
    }

    Filter[] filters = {new HTMLFilter(), new SesitiveFilter() ,new FaceFilter()};//只需要new就行


    public void setMsg(String msg){
        this.msg = msg;
    }

    public String process(){

        String r = new HTMLFilter().doFilter(msg);
        //process the html tag<>
        //String r = msg.replace('<','[').replace('>',']');
        //String r = msg.replace('<','[');
        //r=r.replace('>',']');

        //process the sensitive words
     //   r = r.replace("被就业","就业").replace("敏感","");


        for(Filter f: filters){//有顺序地过滤
            r = f.doFilter( r);
        }
        return r;
    }

}
