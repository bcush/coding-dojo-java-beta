class Project {
	String name;
	String description;

	public Project() {
	}
	
	public Project(String name) {
		this.name = name;
	}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String elevatorPitch() {
		return this.name + ":" + this.description;
	}

	// getter
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	// setter
	public void setName(String nameArg) {
		this.name = nameArg;
	}

	public void setDescription(String descArg) {
		this.description = descArg;
	}

}
