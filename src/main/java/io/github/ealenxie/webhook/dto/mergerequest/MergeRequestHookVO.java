package io.github.ealenxie.webhook.dto.mergerequest;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.ealenxie.webhook.dto.*;

/**
 * Created by EalenXie on 2021/12/10 10:12
 */
public class MergeRequestHookVO implements DingRobotActionCard {

    @JsonProperty("object_kind")
    private String objectKind;
    @JsonProperty("event_type")
    private String eventType;
    private UserVO user;
    private ProjectVO project;
    @JsonProperty("object_attributes")
    private ObjectAttributesVO objectAttributes;
    private String[] labels;
    private ChangesVO changes;
    private RepositoryVO repository;

    public String getObjectKind() {
        return objectKind;
    }

    public void setObjectKind(String objectKind) {
        this.objectKind = objectKind;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }

    public ProjectVO getProject() {
        return project;
    }

    public void setProject(ProjectVO project) {
        this.project = project;
    }

    public ObjectAttributesVO getObjectAttributes() {
        return objectAttributes;
    }

    public void setObjectAttributes(ObjectAttributesVO objectAttributes) {
        this.objectAttributes = objectAttributes;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public ChangesVO getChanges() {
        return changes;
    }

    public void setChanges(ChangesVO changes) {
        this.changes = changes;
    }

    public RepositoryVO getRepository() {
        return repository;
    }

    public void setRepository(RepositoryVO repository) {
        this.repository = repository;
    }

    @Override
    public String getTitle() {
        return getObjectKind();
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        String p = String.format("[[%s]](%s)", project.getName(), project.getWebUrl());
        String sources = String.format("[%s](%s/-/tree/%s)", objectAttributes.getSourceBranch(), project.getWebUrl(), objectAttributes.getSourceBranch());
        String targets = String.format("[%s](%s/-/tree/%s)", objectAttributes.getTargetBranch(), project.getWebUrl(), objectAttributes.getTargetBranch());
        String u = String.format("[%s](%s)", user.getUsername(), UserUtils.getUserHomePage(project.getWebUrl(), user.getUsername()));
        String merge = String.format(" [#%s](%s)(%s)", objectAttributes.getId(), objectAttributes.getUrl(), objectAttributes.getTitle());
        sb.append(String.format("<font color='#000000'>%s %s %s %s %s </font>%n%n", p, u, objectAttributes.getState(), objectKind, merge));
        switch (objectAttributes.getState()) {
            case "opened":
                sb.append(String.format("%s %s  wants to merge %s ➔➔ %s %n", " \uD83D\uDE00 ", user.getUsername(), sources, targets));
                String c = String.format(" %s - %s%n", objectAttributes.getLastCommit().getAuthor().getName(), objectAttributes.getLastCommit().getMessage());
                sb.append(">[").append(objectAttributes.getLastCommit().getId(), 0, 8).append("]").append("(").append(objectAttributes.getLastCommit().getUrl()).append(")").append(c);
                break;
            case "merged":
                sb.append(String.format(" \uD83D\uDE00 %s has completed the merge %s➔➔%s✔️%n", user.getUsername(), sources, targets));
                break;
            case "closed":
                sb.append(String.format(" \uD83D\uDE36 %s has closed the merge %s➔➔%s\uD83D\uDEAB %n", user.getUsername(), sources, targets));
                break;
            default:
                break;
        }
        return sb.toString();
    }
}
