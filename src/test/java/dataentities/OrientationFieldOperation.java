package dataentities;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class OrientationFieldOperation {

    private String fieldName;
    private String sessionId;
    private String taskType;
    private String value;

    public OrientationFieldOperation() {
    }

    @JsonGetter
    public String getFieldName() { return this.fieldName; }

    @JsonGetter
    public String getSessionId() { return this.sessionId; }

    @JsonGetter
    public String getTaskType() { return this.taskType; }

    @JsonGetter
    public String getValue() { return this.value; }

    @JsonSetter
    public void setFieldName(String fieldName) { this.fieldName = fieldName; }

    @JsonSetter
    public void setSessionId(String sessionId) { this.sessionId = sessionId; }

    @JsonSetter
    public void setTaskType(String taskType) { this.taskType = taskType; }

    @JsonSetter
    public void setValue(String value) { this.value = value; }
}
