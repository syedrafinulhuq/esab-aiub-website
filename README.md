# ESAB Website

This is the full-stack project for **ESAB (Engineering Students' Association Bangladesh)**, built using:

- **Frontend**: Next.js (React + TypeScript)
- **Backend**: Java Spring Boot

---

## 🌐 Project Structure

### 🟦 Frontend (Next.js)

```
esab-website/
├── frontend/
│   ├── public/                  # Static assets (images, favicons, etc.)
│   ├── styles/                  # Global styles (e.g. Tailwind config or CSS files)
│   ├── components/              # Shared components (Navbar, Footer, etc.)
│   │   ├── layout/
│   │   ├── ui/
│   ├── features/                # Feature-specific components/pages
│   │   ├── home/
│   │   ├── about/
│   │   ├── events/
│   │   ├── blood-donation/
│   │   │   ├── RequestForm.tsx
│   │   │   ├── RequestList.tsx
│   │   ├── admin/
│   │   ├── contact/
│   ├── pages/                   # Next.js routing (each file = route)
│   │   ├── index.tsx
│   │   ├── about.tsx
│   │   ├── contact.tsx
│   │   ├── events.tsx
│   │   ├── blood-donation.tsx
│   │   ├── admin/
│   │   │   ├── index.tsx
│   │   │   └── requests.tsx
│   ├── lib/                     # API call utilities
│   │   └── api.ts
│   ├── hooks/                   # Custom React hooks
│   ├── context/                 # React contexts (auth, theme, etc.)
│   ├── types/                   # TypeScript interfaces and types
│   ├── .env.local               # API keys, backend URL, etc.
│   ├── tailwind.config.js
│   ├── tsconfig.json
│   └── next.config.js
```

---

### 🟩 Backend (Spring Boot)

```
esab-website/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/esab/
│   │   │   │       ├── ESABApplication.java
│   │   │   │       ├── controller/
│   │   │   │       │   ├── HomeController.java
│   │   │   │       │   ├── BloodRequestController.java
│   │   │   │       ├── model/
│   │   │   │       │   ├── BloodRequest.java
│   │   │   │       ├── repository/
│   │   │   │       │   ├── BloodRequestRepository.java
│   │   │   │       ├── service/
│   │   │   │       │   ├── BloodRequestService.java
│   │   │   ├── resources/
│   │   │   │   ├── application.properties
│   │   │   │   ├── static/
│   │   │   │   └── templates/
│   ├── pom.xml
```

---

## 📡 API Routes

| Endpoint                      | Method | Description                        |
|------------------------------|--------|------------------------------------|
| `/api/blood-requests`        | GET    | Get all blood requests             |
| `/api/blood-requests`        | POST   | Create a new blood request         |
| `/api/blood-requests/{id}` | DELETE | Delete a request (admin only)      |
| `/api/events`                | GET    | List of upcoming ESAB events       |

---

## ❤️ Key Features

- Engineering student-centered portal
- Events, clubs, community updates
- Blood donation request system
- Public + admin panel for blood donations
- Modular, maintainable architecture

---

## 📅 Last updated: May 17, 2025
