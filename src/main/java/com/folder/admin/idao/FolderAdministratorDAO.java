package com.folder.admin.idao;

import com.folder.admin.dto.InformationFileOrFolderDTO;

public interface FolderAdministratorDAO {

    boolean createFolder(InformationFileOrFolderDTO info) throws Exception;

}
