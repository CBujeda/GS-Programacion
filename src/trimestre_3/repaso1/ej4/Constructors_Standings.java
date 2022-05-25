package trimestre_3.repaso1.ej4;

public class Constructors_Standings {

	private int constructorStandingsId;
	private int raceId;
	private int constructorId;
	private int stringpoints;
	private int position;
	private String positionText;
	private int wins;
	public Constructors_Standings(int constructorStandingsId, int raceId, int constructorId, int stringpoints,
			int position, String positionText, int wins) {
		super();
		this.constructorStandingsId = constructorStandingsId;
		this.raceId = raceId;
		this.constructorId = constructorId;
		this.stringpoints = stringpoints;
		this.position = position;
		this.positionText = positionText;
		this.wins = wins;
	}
	public int getConstructorStandingsId() {
		return constructorStandingsId;
	}
	public void setConstructorStandingsId(int constructorStandingsId) {
		this.constructorStandingsId = constructorStandingsId;
	}
	public int getRaceId() {
		return raceId;
	}
	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}
	public int getConstructorId() {
		return constructorId;
	}
	public void setConstructorId(int constructorId) {
		this.constructorId = constructorId;
	}
	public int getStringpoints() {
		return stringpoints;
	}
	public void setStringpoints(int stringpoints) {
		this.stringpoints = stringpoints;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getPositionText() {
		return positionText;
	}
	public void setPositionText(String positionText) {
		this.positionText = positionText;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}

	
	
}
