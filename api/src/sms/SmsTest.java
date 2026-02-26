package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SmsTest {
   public static void main(String[] args) {
      String api_key = "NCSP92XBFPFS1JPD";
      String api_secret = "PIPLAIYNE0A88FHY47IDKMH6GJSXBGCP";
      Message coolsms = new Message(api_key, api_secret);
      
      // 4 params(to, from, type, text) are mandatory. must be filled
      HashMap<String, String> params = new HashMap<String, String>();
      params.put("to", "01000000000");	//받는 분 번호
      params.put("from", "01012345678");	//여러분 핸드폰 번호 (반드시 본인)
      params.put("type", "SMS");
      params.put("text", "테스트용 메시지입니다.");
      params.put("app_version", "text app 1.2"); // application name and version

      try {
         JSONObject obj = (JSONObject) coolsms.send(params);
         System.out.println(obj.toString());
      } catch (CoolsmsException e) { 
         System.out.println(e.getMessage());
         System.out.println(e.getCode());
      }
      
   }
}
