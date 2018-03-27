package com.us.demo.oldversion;

public class Message {
		public static final int HELLO = 0;
		public static final int GOODBYE = 1;
		private String msg = "test";
		private int status;
		private String type;
		private String time;

		public Message() {
			super();
		}
		
		public Message(String time) {
			super();
			this.time=time;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String message) {
			this.msg = message;
		}

		public int getStatus() {
			return this.status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public void setType(String type) {
			this.type = type;
		}
		public String getType() {
			return this.type;
		}
		
		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

	}
