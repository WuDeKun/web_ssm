package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Module implements Serializable{
    private String id;

    private String pid;

    private String text;

    private String moduleurl;

    private String moduleicon;

    private Integer modulesort;

    public Module(String id, String pid, String text, String moduleurl, String moduleicon, Integer modulesort) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.moduleurl = moduleurl;
        this.moduleicon = moduleicon;
        this.modulesort = modulesort;
    }

    public Module() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getModuleurl() {
        return moduleurl;
    }

    public void setModuleurl(String moduleurl) {
        this.moduleurl = moduleurl;
    }

    public String getModuleicon() {
        return moduleicon;
    }

    public void setModuleicon(String moduleicon) {
        this.moduleicon = moduleicon;
    }

    public Integer getModulesort() {
        return modulesort;
    }

    public void setModulesort(Integer modulesort) {
        this.modulesort = modulesort;
    }
}