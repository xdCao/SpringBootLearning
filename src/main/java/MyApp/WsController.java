package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by xdcao on 2017/4/19.
 */
//@Controller
//public class WsController {
//
//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;
//
//    @MessageMapping("/welcome")
//    @SendTo("/topic/getResponse")
//    public WiselyResponse say(WiselyMessage message) throws Exception{
//        Thread.sleep(3000);
//        return new WiselyResponse("Welcome, "+message.getName()+"!");
//    }
//
//    @MessageMapping("/chat")
//    public void handleChat(Principal principal,String msg){
//        if (principal.getName().equals("caohao")){
//            messagingTemplate.convertAndSendToUser("wisely","/queue/notifications",principal.getName()+"-send:"+msg);
//        }else {
//            messagingTemplate.convertAndSendToUser("caohao","/queue/notifications",principal.getName()+"-send:"+msg);
//        }
//    }
//
//}
