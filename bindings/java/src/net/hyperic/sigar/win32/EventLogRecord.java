package net.hyperic.sigar.win32;

/**
 * Class to represent event log records
 */
public class EventLogRecord {

    long recordNumber;
    long timeGenerated; 
    long timeWritten;
    long eventId;

    short eventType;

    String source;
    String computerName;
    String user;
    String message;

    /* Get the record number for this event entry */
    public long getRecordNumber() {
        return recordNumber;
    }

    /**
     * Get the time at which this entry was submitted. This time is 
     * measured in the number of seconds elapsed since 00:00:00 
     * January 1, 1970, Universal Coordinated Time. 
     */

    public long getTimeGenerated() {
        return this.timeGenerated;
    }

    /**
     * Get the time at which this entry was received by the service to be 
     * written to the logfile. This time is measured in the number of 
     * seconds elapsed since 00:00:00 January 1, 1970, Universal 
     * Coordinated Time.
     */
    public long getTimeWritten() {
        return this.timeWritten;
    }

    /**
     * Event identifier. The value is specific to the event source 
     * for the event, and is used with source name to locate a 
     * description string in the message file for the event source. 
     *
     * XXX: This is probably not needed
     */
    public long getEventId() {
        return this.eventId;
    }

    /**
     * Return the event type.  
     * See the EVENTLOG_* constants in the EventLog class
     */
    public short getEventType() {
        return this.eventType;
    }

    /**
     * Get the application which triggered the event
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Get the machine name where the event was generated
     */
    public String getComputerName() {
        return this.computerName;
    }

    /**
     * Get the user who generated the event.  May be null if no user is
     * associated with the event.
     */
    public String getUser() {
        return this.user;
    }
    
    /**
     * Get the message for the event.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @deprecated
     */
    public String getStringData() {
        return getMessage();
    }

    /**
     * For debugging
     */
    public String toString()
    {
        return
            "recordNumber=" + recordNumber + " " +
            "source=" + source + " " +
            "computerName=" + computerName + " " +
            "user=" + user + " " +
            "message=" + message;
    }
}

