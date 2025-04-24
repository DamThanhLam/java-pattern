package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        XMLSystem xmlSystem = new XMLSystem();
        XMLToJSONAdapter adapter = new XMLToJSONAdapter(xmlSystem);
        JSONService jsonService = new JSONService();
        
        String jsonData = adapter.getJSONData();
        
        jsonService.processData(jsonData);
    }
}
