package com.darubramha.slack.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {
	
	Logger log = LoggerFactory.getLogger(SlackController.class);
	
	@RequestMapping(value = "/slashcommand", method = RequestMethod.POST, produces = "application/json")
	public String transliterateSimpleJSON(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "token") String token,
		    @RequestParam(value = "team_id") String team_id,
		    @RequestParam(value = "team_domain") String team_domain,
		    @RequestParam(value = "channel_id") String channel_id,
		    @RequestParam(value = "channel_name") String channel_name,
		    @RequestParam(value = "user_id") String user_id,
		    @RequestParam(value = "user_name") String user_name,
		    @RequestParam(value = "command") String command,
		    @RequestParam(value = "text") String text,
		    @RequestParam(value = "response_url") String response_url) {
		
		/**
		 * Check if the token sent matches with the one given by slack
		 */
		if(!token.equals("<Token ID Given by Slack>")) {
			log.info("user_name : "+user_name+" | text : "+text+" | command : "+command+" | channel_name : "+channel_name
					+" | response_url : "+response_url+" | team_id : "+team_id+" | team_domain : "+team_domain);
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			return "Invalid Request";
			
		}

		/**
		 * response_type
		 * ephemeral
		 * 	Response only shown to the user who uses the slash command
		 * in_channel
		 * 	Response shown to the channel, with the typed command
		 */
		
		JSONObject obj = new JSONObject();
		obj.put("response_type", "ephemeral");
		obj.put("text", "If you see this, your configuration is setup!");
		return obj.toString();
		
		/**
		 * To send a delayed response
		 * make a call to the response_url sent by slack.
		 * 
		 */
		// com.squareup.okhttp.RequestBody body1 =
		// com.squareup.okhttp.RequestBody.create(mediaType,
		//		"{\"response_type\":[\"in_channel\"],\"text\":\""If you see this, your configuration is setup!"\"}");
		// Request req1 = new Request.Builder()
		// .url(response_url)
		// .post(body)
		// .addHeader("content-type", "application/json")
		// .build();
		// Response send = client.newCall(req1).execute();			
			
	}
}
