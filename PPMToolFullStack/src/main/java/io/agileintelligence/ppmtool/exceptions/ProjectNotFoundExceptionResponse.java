package io.agileintelligence.ppmtool.exceptions;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class ProjectNotFoundExceptionResponse {
    private  String ProjectNotFound;
    public ProjectNotFoundExceptionResponse(String projectNotFound){
        ProjectNotFound = projectNotFound;
    }
    public String getProjectNotFound() {
        return ProjectNotFound;
    }
    public void setProjectNotFound(String projectNotFound){
        ProjectNotFound = projectNotFound;
    }
}
