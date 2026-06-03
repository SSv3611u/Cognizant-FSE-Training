SELECT
  e.title AS event_name,
  s1.title AS first_session,
  s2.title AS second_session,
  s1.start_time,
  s1.end_time,
  s2.start_time AS conflicting_start_time,
  s2.end_time AS conflicting_end_time
FROM sessions s1
JOIN sessions s2
  ON s1.event_id = s2.event_id
  AND s1.session_id < s2.session_id
  AND s1.start_time < s2.end_time
  AND s2.start_time < s1.end_time
JOIN events e ON e.event_id = s1.event_id;
