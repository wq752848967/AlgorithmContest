import java.util.HashMap;
import java.util.Map;

public class Evaluate_Division {
    public static void main(String[] args) {
    //https://www.cnblogs.com/grandyang/p/5880133.html
    }
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, Map<String,Double>> m = new HashMap<>();
        double[] result = new double[queries.length];
        //初始化部分
        for(int i=0;i<equations.length;i++){
            String[] item = equations[i];
            if(!m.containsKey(equations[0])){
                Map<String,Double> map = new HashMap<>();
                m.put(item[0],map);
            }
            Map<String,Double> map = m.get(item[0]);
            map.put(item[1],values[i]);


            if(!m.containsKey(equations[1])){
                Map<String,Double> map_re = new HashMap<>();
                m.put(item[1],map_re);
            }
            Map<String,Double> map_re = m.get(item[1]);
            map.put(item[0],1/values[i]);
        }
        //计算部分

        for(int i=0;i<queries.length;i++){
            Map<String,Integer> visit = new HashMap<>();
            String[] item = queries[i];
            result[i] = findQurty(m,item[0],item[1],visit);
        }
        return result;
    }
    public Double findQurty( Map<String, Map<String,Double>> m,String begin,String end,Map<String,Integer> visit){
        Map<String,Double> map = null;
        if(!m.containsKey(begin)){
            return -1.0;
        }else{
            map = m.get(begin);
        }
        if(map.containsKey(end)){
            return map.get(end);
        }
        //遍历递归元素
        for (String key:map.keySet()){
            if(visit.containsKey(key)){
                continue;
            }
            visit.put(key,1);
            double sub_result = findQurty(m,key,end,visit);
            if(sub_result!=-1){
                return sub_result*map.get(key);
            }
        }
        return -1.0;
    }
}
