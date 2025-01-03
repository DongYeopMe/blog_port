import React,{useState} from "react";
import { Link, useNavigate } from "react-router-dom";
import FullCalendar from '@fullcalendar/react';
import dayGridPlugin from '@fullcalendar/daygrid';
import './CalendarPage.css';
function CalendarPage(){
    const [value,setValue] = useState(new Date());
    const [events,setEvents]=useState([
        { title: 'Event 1', date: '2025-01-01' },
        { title: 'Event 2', date: '2025-01-02' },
        { title: 'Event 2', start: '2025-01-02', end: '2025-01-05' },
        ])
    return (
       <FullCalendar
      plugins={[dayGridPlugin]}
      initialView="dayGridMonth"
      height="auto"
      events={events}
      editable={true}
      selectable={true}
      dayMaxEvents: true
      headerToolbar={{
            start: "prev next today",
            center: "title",
            end: "dayGridMonth dayGridWeek dayGridDay",
        }}
      views={{
        dayGridMonth: { 
              dayMaxEventRows: 3, // 하루에 최대 3개의 이벤트 행 표시 (초과되는 건 +more 로 표시됨)
              buttonText: '월' 
        },
        dayGridWeek: { 
              buttonText: '주' // 주간 뷰 버튼 텍스트 설정
        },
        dayGridDay: { 
              buttonText: '일간' // 일간 뷰 버튼 텍스트 설정
        }
      }}
      locale={'ko'}
      eventColor="#76c3c5" // 이벤트 기본 색상 설정
      eventTextColor="black"

      select={(info) => {
        const newEvent = {
          title: "New Event",
          start: info.startStr,
          end: info.endStr,
        };
        setEvents([...events, newEvent]); // 기존 이벤트에 새 일정 추가
      }}
        />
        
    )
}
export default CalendarPage;