package keyword;

public class Team {
		private int teamId;
		private String teamname;
		private String coachName;
		
		public Team() {
			//constructor
		}

		public Team(int teamId, String teamname, String coachName) {
			super();
			this.teamId = teamId;
			this.teamname = teamname;
			this.coachName = coachName;
		}

		public int getTeamId() {
			return teamId;
		}

		public void setTeamId(int teamId) {
			this.teamId = teamId;
		}

		public String getTeamname() {
			return teamname;
		}

		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}

		public String getCoachName() {
			return coachName;
		}

		public void setCoachName(String coachName) {
			this.coachName = coachName;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Team [teamId = " +teamId+", teamName = " +teamname+ " coachName = "+ coachName +"]";
		}
		
		
	

}
