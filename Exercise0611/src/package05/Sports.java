package package05;

public class Sports {
		private String swimming;
		private String football;
		private int medal;
		
		public Sports(String swimming, String football, int medal) {
			super();
			this.swimming = swimming;
			this.football = football;
			this.medal = medal;
		}

		public Sports() {
			super();
		}

		public String getSwimming() {
			return swimming;
		}

		public void setSwimming(String swimming) {
			this.swimming = swimming;
		}

		public String getFootball() {
			return football;
		}

		public void setFootball(String football) {
			this.football = football;
		}

		public int getMedal() {
			return medal;
		}

		public void setMedal(int medal) {
			this.medal = medal;
		}
		
		
}
