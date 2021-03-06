package com.d.enum_ex;
//RED->YELLOW

//Y-> G
//G->R

//interface NextLight{
//	public abstract TrafficLight nextLight();
//}
enum TrafficLight /* implements NextLight */ {
	RED {
		@Override
		public TrafficLight nextLight() {
			return YELLOW;
		}
	},
	YELLOW {
		@Override
		public TrafficLight nextLight() {
			return GREEN;
		}
	},
	GREEN;

//
	public TrafficLight nextLight() {
		return RED;
	}
}

public class E_Abstract_Method_In_Enum {

	public static void main(String[] args) {
		TrafficLight light = TrafficLight.RED;
		System.out.println(light.nextLight());
	}
}
