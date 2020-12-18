package keyword;

public class Project {
	private int projectId;
	private String projectName;
	private String clientName;
	
	public Project() {
		
	}
	
	public Project(int projectId, String projectName, String clientName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.clientName = clientName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	@Override
	public String toString() {
		return "Emppoyee [projectId=" +projectId+", projectName= " +projectName+ " clientName="+"clientName"+"]";
	}
	
	
}
