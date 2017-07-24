package com.computerworks.jhip.service.dto;


import java.time.ZonedDateTime;
import java.io.Serializable;
import java.util.Objects;
import com.computerworks.jhip.domain.enumeration.Language;

/**
 * A DTO for the JobHistory entity.
 */
public class JobHistoryDTO implements Serializable {

    private String id;

    private ZonedDateTime startDate;

    private ZonedDateTime endDate;

    private Language language;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JobHistoryDTO jobHistoryDTO = (JobHistoryDTO) o;
        if(jobHistoryDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), jobHistoryDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "JobHistoryDTO{" +
            "id=" + getId() +
            ", startDate='" + getStartDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            ", language='" + getLanguage() + "'" +
            "}";
    }
}
