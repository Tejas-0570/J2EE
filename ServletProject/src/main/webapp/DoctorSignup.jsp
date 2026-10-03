<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Doctor Registration | City Care Hospital</title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.11.3/font/bootstrap-icons.min.css" rel="stylesheet">

<style>
  :root {
    --primary: #0d6e6e;
    --primary-dark: #095353;
    --accent: #e8f5f4;
    --text-dark: #1f2d2d;
    --text-muted: #5c6b6b;
    --border-soft: #d9e6e5;
  }

  * { box-sizing: border-box; }

  body {
    background-color: #f7faf9;
    color: var(--text-dark);
    font-family: 'Segoe UI', Roboto, Helvetica, Arial, sans-serif;
  }

  .navbar-custom {
    background-color: #ffffff;
    border-bottom: 1px solid var(--border-soft);
    padding: 14px 0;
  }

  .brand-icon { color: var(--primary); font-size: 1.6rem; margin-right: 8px; }

  .navbar-brand { font-weight: 700; color: var(--text-dark) !important; }

  .page-wrap {
    min-height: calc(100vh - 66px);
    display: flex;
    align-items: center;
    justify-content: center;
    padding: 40px 15px;
  }

  .signup-card {
    background: #fff;
    border: 1px solid var(--border-soft);
    border-radius: 14px;
    box-shadow: 0 10px 30px rgba(13, 110, 110, 0.08);
    max-width: 620px;
    width: 100%;
    padding: 40px 40px 32px;
  }

  .signup-icon-circle {
    width: 56px;
    height: 56px;
    border-radius: 50%;
    background: var(--accent);
    color: var(--primary);
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 1.5rem;
    margin: 0 auto 16px;
  }

  .signup-title { font-weight: 700; font-size: 1.3rem; text-align: center; }

  .signup-sub {
    color: var(--text-muted);
    font-size: 0.88rem;
    text-align: center;
    margin-bottom: 22px;
  }

  .form-label { font-weight: 600; font-size: 0.88rem; }

  .form-control, .form-select {
    border: 1px solid var(--border-soft);
    border-radius: 8px;
    padding: 10px 14px;
    font-size: 0.95rem;
  }

  .form-control:focus, .form-select:focus {
    border-color: var(--primary);
    box-shadow: 0 0 0 3px rgba(13, 110, 110, 0.12);
  }

  .input-icon-wrap { position: relative; }
  .input-icon-wrap i {
    position: absolute;
    left: 14px;
    top: 50%;
    transform: translateY(-50%);
    color: var(--text-muted);
  }
  .input-icon-wrap .form-control,
  .input-icon-wrap .form-select { padding-left: 38px; }

  .btn-signup {
    background-color: var(--primary);
    border: none;
    color: #fff;
    font-weight: 600;
    padding: 11px 0;
    border-radius: 8px;
    width: 100%;
    font-size: 0.98rem;
    margin-top: 6px;
  }
  .btn-signup:hover { background-color: var(--primary-dark); color: #fff; }

  .switch-link {
    text-align: center;
    font-size: 0.86rem;
    color: var(--text-muted);
    margin-top: 18px;
  }
  .switch-link a { color: var(--primary); font-weight: 600; text-decoration: none; }
  .switch-link a:hover { text-decoration: underline; }

  hr.divider { border-top: 1px dashed var(--border-soft); margin: 22px 0 18px; }

  fieldset legend {
    font-size: 0.75rem;
    text-transform: uppercase;
    letter-spacing: 0.6px;
    color: var(--text-muted);
    font-weight: 700;
    margin-bottom: 10px;
  }

  .notice-strip {
    background: var(--accent);
    color: var(--primary-dark);
    border-radius: 8px;
    padding: 12px 14px;
    font-size: 0.82rem;
    display: flex;
    align-items: flex-start;
    gap: 10px;
    margin-top: 20px;
  }
</style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-custom">
  <div class="container">
    <a class="navbar-brand d-flex align-items-center" href="index.html">
      <i class="bi bi-hospital brand-icon"></i>
      City Care Hospital
    </a>
  </div>
</nav>

<div class="page-wrap">
  <div class="signup-card">
    <div class="signup-icon-circle"><i class="bi bi-person-badge"></i></div>
    <div class="signup-title">Doctor Registration</div>
    <div class="signup-sub">Register to join our panel of specialists — subject to admin approval</div>

    <form action="HandleDoctorSignup.jsp" method="post">

      <fieldset class="mb-2">
        <legend>Personal Details</legend>
        <div class="row g-3">
          <div class="col-md-6">
            <label class="form-label">Full Name *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-person"></i>
              <input type="text" class="form-control" name="name" placeholder="e.g. Dr. Anil Verma" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Phone Number *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-telephone"></i>
              <input type="tel" class="form-control" name="phone" placeholder="e.g. 98765 43210" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Email Address *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-envelope"></i>
              <input type="email" class="form-control" name="email" placeholder="you@example.com" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Gender</label>
            <select class="form-select" name="gender">
              <option selected>Select</option>
              <option value="female">Female</option>
              <option value="male">Male</option>
              <option value="other">Other</option>
            </select>
          </div>
        </div>
      </fieldset>

      <hr class="divider">

      <fieldset class="mb-2">
        <legend>Professional Details</legend>
        <div class="row g-3">
          <div class="col-md-6">
            <label class="form-label">Specialization *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-heart-pulse"></i>
              <select class="form-select" name="specialization" required>
                <option selected disabled value="">Choose specialization</option>
                <option value="General Medicine">General Medicine</option>
                <option value="Cardiology">Cardiology</option>
                <option value="Orthopedics">Orthopedics</option>
                <option value="Pediatrics">Pediatrics</option>
                <option value="Dermatology">Dermatology</option>
                <option value="ENT">ENT</option>
                <option value="Gynecology">Gynecology</option>
              </select>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Qualification *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-mortarboard"></i>
              <input type="text" class="form-control" name="qualification" placeholder="e.g. MBBS, MD" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Medical Registration No. *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-card-checklist"></i>
              <input type="text" class="form-control" name="regNumber" placeholder="e.g. MCI-123456" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Years of Experience</label>
            <div class="input-icon-wrap">
              <i class="bi bi-briefcase"></i>
              <input type="number" class="form-control" name="experience" placeholder="e.g. 5" min="0">
            </div>
          </div>
        </div>
      </fieldset>

      <hr class="divider">

      <fieldset class="mb-2">
        <legend>Account Security</legend>
        <div class="row g-3">
          <div class="col-md-6">
            <label class="form-label">Password *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-lock"></i>
              <input type="password" class="form-control" name="password" placeholder="Create a password" required>
            </div>
          </div>
          <div class="col-md-6">
            <label class="form-label">Confirm Password *</label>
            <div class="input-icon-wrap">
              <i class="bi bi-lock-fill"></i>
              <input type="password" class="form-control" name="confirmPassword" placeholder="Re-enter password" required>
            </div>
          </div>
        </div>
      </fieldset>

      <div class="notice-strip">
        <i class="bi bi-info-circle-fill fs-6"></i>
        <span>Your registration will be reviewed by hospital admin. You'll be able to log in only after your account is approved.</span>
      </div>

      <button type="submit" class="btn-signup">
        <i class="bi bi-send-check me-2"></i>Submit Registration
      </button>

    </form>

    <hr class="divider">

    <div class="switch-link">
      Already registered? <a href="Login.jsp?role=doctor">Login here</a>
    </div>
    <div class="switch-link">
      Are you a patient? <a href="PatientSignup.jsp">Create Patient Account</a>
    </div>

  </div>
</div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
