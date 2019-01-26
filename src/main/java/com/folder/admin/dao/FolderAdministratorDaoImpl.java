package com.folder.admin.dao;

import com.folder.admin.dto.InformationFileOrFolderDTO;
import com.folder.admin.idao.FolderAdministratorDAO;

import java.io.File;

public class FolderAdministratorDaoImpl implements FolderAdministratorDAO {


    public boolean createFolder(InformationFileOrFolderDTO info) {
        System.out.println("Init to create folder with path: " + info.getPath());
        File file = new File(info.getPath());
        boolean created = false;
        if ((!file.isDirectory() && !info.getWithSubDirectories())) {
            created = new File(info.getPath()).mkdir();
        }
        else if ((!file.isDirectory() && info.getWithSubDirectories())){
            created = new File(info.getPath()).mkdirs();
        }
        else{
            System.out.println("Exist a directory with this name : " + info.getPath());
        }

        if (!created) {
            System.out.println("Folder no created in absolute path : " + file.getAbsolutePath());
        } else {
            System.out.println("Folder created in absolute path :  " + file.getAbsolutePath());
        }

        return created;
    }
}
