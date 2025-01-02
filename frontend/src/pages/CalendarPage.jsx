import React,{useState} from "react";
import { Link, useNavigate } from "react-router-dom";
import FullCalendar from '@fullcalendar/react';
import dayGridPlugin from '@fullcalendar/daygrid';

function CalendarPage(){
    const [value,setValue] = useState(new Date());
    return (
       <FullCalendar
      plugins={[dayGridPlugin]}
      initialView="dayGridMonth"
      height="auto"
      editable={true}
      selectable={true}
      headerToolbar={{
            start: "prev next",
            center: "title",
            end: "dayGridMonth dayGridWeek",
        }}
        locale={'ko'}
      events={[
        { title: 'Event 1', date: '2025-01-01' },
        { title: 'Event 2', date: '2025-01-02' },
        ]}
        />
        
    )
}
export default CalendarPage;