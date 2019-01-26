package com.folder.admin.dto;

public class InformationFileOrFolderDTO {
    private String path;
    private boolean withSubDirectories;

   public InformationFileOrFolderDTO(){

    }

    public InformationFileOrFolderDTO(String path,boolean withSubDirectories){
        this.path=path;
        this.withSubDirectories=withSubDirectories;
    }

    public InformationFileOrFolderDTO setPath(String path){
        this.path=path;
        return this;
    }

    public String getPath(){
        return this.path;
    }

    public InformationFileOrFolderDTO setWithSubDirectories(boolean isWithSubDirectories){
        this.withSubDirectories=isWithSubDirectories;
        return this;
    }

    public boolean getWithSubDirectories(){
       return this.withSubDirectories;
    }

    public InformationFileOrFolderDTO builder(){
        return new InformationFileOrFolderDTO(this.path,this.withSubDirectories);
    }
}
