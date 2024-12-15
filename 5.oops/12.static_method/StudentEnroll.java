class StudentEnroll {
    private String id,name,branch;
    public static int count=0;
    public static String org_name = "DYP";

    public StudentEnroll(String id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        count++;
    }
    
    public void getDetails() {
        System.out.println("ID: "+id+"\nName: "+name+"\nBranch: "+branch+"\nOrganisation: "+org_name);
    }

    public static void setOrgName(String org){
        org_name = org;
    }
    public static void showOrgData(){
        System.out.println("Organisation Name: "+org_name+"\nTotal Students: "+count);
    }

}
