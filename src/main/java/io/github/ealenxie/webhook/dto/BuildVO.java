package io.github.ealenxie.webhook.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Created by EalenXie on 2021/12/1 9:46
 */
public class BuildVO implements Comparable<BuildVO> {

    private Long id;
    private String stage;
    private String name;
    private String status;
    @JsonProperty("created_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String createdAt;
    @JsonProperty("started_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String startedAt;
    @JsonProperty("finished_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private String finishedAt;
    private Double duration;
    @JsonProperty("queued_duration")
    private Double queuedDuration;
    private String when;
    private Boolean manual;
    @JsonProperty("allow_failure")
    private Boolean allowFailure;
    private UserVO user;
    private RunnerVO runner;
    @JsonProperty("artifacts_file")
    private ArtifactsFileVO artifactFile;
    private String environment;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getQueuedDuration() {
        return queuedDuration;
    }

    public void setQueuedDuration(Double queuedDuration) {
        this.queuedDuration = queuedDuration;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public Boolean getManual() {
        return manual;
    }

    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    public Boolean getAllowFailure() {
        return allowFailure;
    }

    public void setAllowFailure(Boolean allowFailure) {
        this.allowFailure = allowFailure;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }


    public RunnerVO getRunner() {
        return runner;
    }

    public void setRunner(RunnerVO runner) {
        this.runner = runner;
    }

    public ArtifactsFileVO getArtifactFile() {
        return artifactFile;
    }

    public void setArtifactFile(ArtifactsFileVO artifactFile) {
        this.artifactFile = artifactFile;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public int compareTo(BuildVO o) {
        if (Objects.equals(id, o.id)) {
            return 0;
        }
        if (id > o.id) return 1;
        else return -1;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
