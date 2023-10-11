package model;

public class CalcTemperatura {

	public float ConversaoFtoC(float TempF) {
		float tempConversao = (TempF-32f)*5f/9f;
		return tempConversao;
	}

}
