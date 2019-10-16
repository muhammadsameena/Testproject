package M5;

public class Task {
	private String taskName;
	private String status;
	private String descp;
	private String dueDate;
	
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", status=" + status + ", descp=" + descp + ", dueDate=" + dueDate + "]";
	}
	
	
	
}

	