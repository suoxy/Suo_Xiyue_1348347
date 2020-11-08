package Business;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suoxiyue
 */
public class OrganizationDir {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDir() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public void add(Organization organization){
        organizationList.add(organization);
    }
}
