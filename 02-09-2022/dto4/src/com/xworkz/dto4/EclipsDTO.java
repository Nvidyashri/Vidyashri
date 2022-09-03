package com.xworkz.dto4;

public class EclipsDTO {
	private String name;
	private String type;
	private String use;
	private double version;
	private boolean newFileCreat;
	private String editeOption;
	private boolean runOption;
	private String source;
	private String refactor;
	private String navigation;
	private boolean searchOption;
	private String project;
	private int window;
	private String help;
	private String packageExploror;
	private boolean saveOption;
	private String packagrCreation;
	private String classCreation;
	private boolean deletOption;
	private boolean reWriteOption;
	private boolean reNameOPtion;
	private String setting;
	private String minimize;
	private String taskList;
	private String console;
	private String reStore;
	private String openTask;
	private String debugOption;
	private boolean pinEditorOption;
	private boolean previousEditOption;
	private boolean nextAnnotetionOption;
	private String remove;
	private boolean skipAllOption;
	
	@Override
	public int hashCode() {
		return 12;
	}
	@Override
	public boolean equals(Object obj) {
		
		if (obj != null ) {
			System.out.println("it is not equal");
			if(obj instanceof EclipsDTO) {
				System.out.println("it is a instanceof Eclips");
				EclipsDTO converted=(EclipsDTO) obj;//casting
				 if(converted.debugOption.equals(this.debugOption)&& converted.editeOption.equals(this.editeOption)) {
					  System.out.println("debugOption and editeOption are equal");
				
			}
				 else {
					 System.out.println("debugOption and editeOption are not equal");
				 }
		}
			else {
				System.out.println("both are equal");
			}
		}
		return super.equals(obj);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public boolean isNewFileCreat() {
		return newFileCreat;
	}
	public void setNewFileCreat(boolean newFileCreat) {
		this.newFileCreat = newFileCreat;
	}
	public String isEditeOption() {
		return editeOption;
	}
	public void setEditeOption(String editeOption) {
		this.editeOption = editeOption;
	}
	public boolean isRunOption() {
		return runOption;
	}
	public void setRunOption(boolean runOption) {
		this.runOption = runOption;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getRefactor() {
		return refactor;
	}
	public void setRefactor(String refactor) {
		this.refactor = refactor;
	}
	public String getNavigation() {
		return navigation;
	}
	public void setNavigation(String navigation) {
		this.navigation = navigation;
	}
	public boolean isSearchOption() {
		return searchOption;
	}
	public void setSearchOption(boolean searchOption) {
		this.searchOption = searchOption;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public int getWindow() {
		return window;
	}
	public void setWindow(int window) {
		this.window = window;
	}
	public String getHelp() {
		return help;
	}
	public void setHelp(String help) {
		this.help = help;
	}
	public String getPackageExploror() {
		return packageExploror;
	}
	public void setPackageExploror(String packageExploror) {
		this.packageExploror = packageExploror;
	}
	public boolean isSaveOption() {
		return saveOption;
	}
	public void setSaveOption(boolean saveOption) {
		this.saveOption = saveOption;
	}
	public String getPackagrCreation() {
		return packagrCreation;
	}
	public void setPackagrCreation(String packagrCreation) {
		this.packagrCreation = packagrCreation;
	}
	public String getClassCreation() {
		return classCreation;
	}
	public void setClassCreation(String classCreation) {
		this.classCreation = classCreation;
	}
	public boolean isDeletOption() {
		return deletOption;
	}
	public void setDeletOption(boolean deletOption) {
		this.deletOption = deletOption;
	}
	public boolean isReWriteOption() {
		return reWriteOption;
	}
	public void setReWriteOption(boolean reWriteOption) {
		this.reWriteOption = reWriteOption;
	}
	public boolean isReNameOPtion() {
		return reNameOPtion;
	}
	public void setReNameOPtion(boolean reNameOPtion) {
		this.reNameOPtion = reNameOPtion;
	}
	public String getSetting() {
		return setting;
	}
	public void setSetting(String setting) {
		this.setting = setting;
	}
	public String getMinimize() {
		return minimize;
	}
	public void setMinimize(String minimize) {
		this.minimize = minimize;
	}
	public String getTaskList() {
		return taskList;
	}
	public void setTaskList(String taskList) {
		this.taskList = taskList;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getReStore() {
		return reStore;
	}
	public void setReStore(String reStore) {
		this.reStore = reStore;
	}
	public String getOpenTask() {
		return openTask;
	}
	public void setOpenTask(String openTask) {
		this.openTask = openTask;
	}
	public String isDebugOption() {
		return debugOption;
	}
	public void setDebugOption(String debugOption) {
		this.debugOption = debugOption;
	}
	public boolean isPinEditorOption() {
		return pinEditorOption;
	}
	public void setPinEditorOption(boolean pinEditorOption) {
		this.pinEditorOption = pinEditorOption;
	}
	public boolean isPreviousEditOption() {
		return previousEditOption;
	}
	public void setPreviousEditOption(boolean previousEditOption) {
		this.previousEditOption = previousEditOption;
	}
	public boolean isNextAnnotetionOption() {
		return nextAnnotetionOption;
	}
	public void setNextAnnotetionOption(boolean nextAnnotetionOption) {
		this.nextAnnotetionOption = nextAnnotetionOption;
	}
	public String getRemove() {
		return remove;
	}
	public void setRemove(String remove) {
		this.remove = remove;
	}
	public boolean isSkipAllOption() {
		return skipAllOption;
	}
	public void setSkipAllOption(boolean skipAllOption) {
		this.skipAllOption = skipAllOption;
	}
	
	

}
