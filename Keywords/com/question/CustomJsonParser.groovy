package com.question

import org.json.*;
import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser

import com.kms.katalon.core.annotation.Keyword

public class CustomJsonParser {

	@Keyword
	public void jsonExtractor(String response){
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(response);
		String authenticationToken = (String) jsonObject.get("color");
		println authenticationToken
	}
}
