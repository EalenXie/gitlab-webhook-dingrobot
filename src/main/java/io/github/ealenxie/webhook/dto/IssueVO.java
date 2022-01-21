package io.github.ealenxie.webhook.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by EalenXie on 2022/1/21 16:13
 */
public class IssueVO {
    @JsonProperty("author_id")
    private Long authorId;
    @JsonProperty("closed_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String closedAt;
    private Boolean confidential;
    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String createdAt;
    private String description;
    @JsonProperty("discussion_locked")
    private Boolean discussionLocked;
    @JsonProperty("due_date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String dueDate;
    private Long id;
    private Long iid;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    @JsonProperty("last_edited_at")
    private String lastEditedAt;
    @JsonProperty("last_edited_by_id")
    private Long lastEditedById;
    @JsonProperty("milestone_id")
    private Long milestoneId;
    @JsonProperty("moved_to_id")
    private Long movedToId;
    @JsonProperty("duplicated_to_id")
    private Long duplicatedToId;
    @JsonProperty("project_id")
    private Long projectId;
    @JsonProperty("relative_position")
    private Integer relativePosition;
    @JsonProperty("state_id")
    private Long stateId;
    @JsonProperty("time_estimate")
    private Integer timeEstimate;
    private String title;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("updated_by_id")
    private Long updatedById;
    private Double weight;
    private String url;
    @JsonProperty("total_time_spent")
    private Integer totalTimeSpent;
    @JsonProperty("time_change")
    private Integer timeChange;
    @JsonProperty("human_total_time_spent")
    private Integer humanTotalTimeSpent;
    @JsonProperty("human_time_change")
    private Integer humanTimeChange;
    @JsonProperty("human_time_estimate")
    private Integer humanTimeEstimate;
    @JsonProperty("assignee_ids")
    private Integer[] assigneeIds;
    @JsonProperty("assignee_id")
    private Long assigneeId;
    private String state;
    private String action;
    private String severity;
    private List<LabelVO> labels;


    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public Boolean getConfidential() {
        return confidential;
    }

    public void setConfidential(Boolean confidential) {
        this.confidential = confidential;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDiscussionLocked() {
        return discussionLocked;
    }

    public void setDiscussionLocked(Boolean discussionLocked) {
        this.discussionLocked = discussionLocked;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIid() {
        return iid;
    }

    public void setIid(Long iid) {
        this.iid = iid;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }

    public void setLastEditedAt(String lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Long getLastEditedById() {
        return lastEditedById;
    }

    public void setLastEditedById(Long lastEditedById) {
        this.lastEditedById = lastEditedById;
    }

    public Long getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Long milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Long getMovedToId() {
        return movedToId;
    }

    public void setMovedToId(Long movedToId) {
        this.movedToId = movedToId;
    }

    public Long getDuplicatedToId() {
        return duplicatedToId;
    }

    public void setDuplicatedToId(Long duplicatedToId) {
        this.duplicatedToId = duplicatedToId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Integer getRelativePosition() {
        return relativePosition;
    }

    public void setRelativePosition(Integer relativePosition) {
        this.relativePosition = relativePosition;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Integer getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(Integer timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUpdatedById() {
        return updatedById;
    }

    public void setUpdatedById(Long updatedById) {
        this.updatedById = updatedById;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getTotalTimeSpent() {
        return totalTimeSpent;
    }

    public void setTotalTimeSpent(Integer totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    public Integer getTimeChange() {
        return timeChange;
    }

    public void setTimeChange(Integer timeChange) {
        this.timeChange = timeChange;
    }

    public Integer getHumanTotalTimeSpent() {
        return humanTotalTimeSpent;
    }

    public void setHumanTotalTimeSpent(Integer humanTotalTimeSpent) {
        this.humanTotalTimeSpent = humanTotalTimeSpent;
    }

    public Integer getHumanTimeChange() {
        return humanTimeChange;
    }

    public void setHumanTimeChange(Integer humanTimeChange) {
        this.humanTimeChange = humanTimeChange;
    }

    public Integer getHumanTimeEstimate() {
        return humanTimeEstimate;
    }

    public void setHumanTimeEstimate(Integer humanTimeEstimate) {
        this.humanTimeEstimate = humanTimeEstimate;
    }

    public Integer[] getAssigneeIds() {
        return assigneeIds;
    }

    public void setAssigneeIds(Integer[] assigneeIds) {
        this.assigneeIds = assigneeIds;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public List<LabelVO> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelVO> labels) {
        this.labels = labels;
    }
}
