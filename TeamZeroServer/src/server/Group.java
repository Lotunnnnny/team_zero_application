package server;

/**
 * Encapsulates a chat group
 *
 */
public class Group {
	private String groupName;
	private int id;
	
	private String[] members;
	private Boolean[] leftGroup;
	
	public Group(int id, String groupName, String[] members) {
		this.id = id;
		this.groupName = groupName;
		this.setMembers(members);
	}
	
	public Group(int id, String groupName, String[] members, Boolean[] leftGroup) {
		this.id = id;
		this.groupName = groupName;
		this.setMembers(members);
		this.setLeftGroup(leftGroup);
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String[] getMembers() {
		return members;
	}

	public void setMembers(String[] members) {
		this.members = members;
	}
	
	public Boolean[] getLeftGroup() {
		return leftGroup;
	}

	public void setLeftGroup(Boolean[] leftGroup) {
		this.leftGroup = leftGroup;
	}
	

}
