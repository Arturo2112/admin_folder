package com.folder.admin.main;

import com.folder.admin.dao.FolderAdministratorDaoImpl;
import com.folder.admin.dto.InformationFileOrFolderDTO;
import com.folder.admin.idao.FolderAdministratorDAO;

public class AppFolderAdministrator {

    public static void main(String args[]){
        FolderAdministratorDAO folder = new FolderAdministratorDaoImpl();

        try {
          boolean create = folder.createFolder(new InformationFileOrFolderDTO().setPath("prueba2/d").setWithSubDirectories(false).builder());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}