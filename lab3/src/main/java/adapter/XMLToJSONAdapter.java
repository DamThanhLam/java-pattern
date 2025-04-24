package adapter;

import org.json.JSONObject;
import org.json.XML;

class XMLToJSONAdapter {
    private XMLSystem xmlSystem;
    
    public XMLToJSONAdapter(XMLSystem xmlSystem) {
        this.xmlSystem = xmlSystem;
    }
    
    public String getJSONData() {
        String xmlData = xmlSystem.getXMLData();
        JSONObject json = XML.toJSONObject(xmlData);
        return json.toString();
    }
}