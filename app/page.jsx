"use client";

import {
  FaJava,
  FaLinkedin,
  FaGithub,
  FaPhoneAlt,
} from "react-icons/fa";

import {
  SiHtml5,
  SiCss3,
  SiMysql,
  SiMongodb,
  SiFigma,
  SiCanva,
} from "react-icons/si";

/* =======================
   SKILLS DATA
======================= */
const skills = [
  {
    name: "Java",
    icon: <FaJava />,
    color: "from-orange-500 to-red-500",
  },
  {
    name: "HTML",
    icon: <SiHtml5 />,
    color: "from-orange-400 to-orange-600",
  },
  {
    name: "CSS",
    icon: <SiCss3 />,
    color: "from-blue-400 to-blue-600",
  },
  {
    name: "MySQL",
    icon: <SiMysql />,
    color: "from-blue-500 to-indigo-600",
  },
  {
    name: "MongoDB",
    icon: <SiMongodb />,
    color: "from-green-500 to-emerald-600",
  },
  {
    name: "Figma",
    icon: <SiFigma />,
    color: "from-pink-500 to-purple-600",
  },
  {
    name: "Canva",
    icon: <SiCanva />,
    color: "from-sky-500 to-cyan-600",
  },
];

export default function Home() {
  return (
    <main className="min-h-screen font-sans leading-relaxed bg-gray-50 text-gray-800">

      {/* ================= NAVBAR ================= */}
      <nav className="w-full px-6 py-4 border-b flex justify-center">
        <h1 className="text-2xl font-bold">Diksha Agrawal</h1>
      </nav>

      {/* ================= HERO ================= */}
      <section className="flex flex-col items-center text-center py-24 px-6">
        <h2 className="text-4xl md:text-5xl font-bold mb-6">
          B.Tech CSE (E-Commerce Technology), VIT Bhopal
        </h2>

        <a
          href="/DIKSHA-RESUME.pdf"
          download
          className="px-8 py-3 rounded-xl bg-gradient-to-r from-blue-600 to-purple-600 text-white font-semibold shadow-lg hover:scale-105 transition"
        >
          Download Resume
        </a>
      </section>

      {/* ================= ABOUT ================= */}
      <section className="max-w-4xl mx-auto py-20 px-6 text-center">
        <h2 className="text-3xl font-bold mb-6">About Me</h2>
        <p className="text-lg">
          I am a motivated Computer Science undergraduate specializing in
          E-Commerce Technology. I enjoy solving problems, building products,
          and learning new technologies.
        </p>
      </section>

      {/* ================= SKILLS ================= */}
            {/* ================= SKILLS ================= */}
      <section className="max-w-6xl mx-auto py-16 px-6">
        <h2 className="text-3xl font-bold text-center mb-10">
          Skills
        </h2>

        <div className="grid grid-cols-3 sm:grid-cols-4 md:grid-cols-5 gap-6 justify-items-center">
          {skills.map((skill) => (
            <div
              key={skill.name}
              className={`w-24 h-24 rounded-xl flex flex-col items-center justify-center text-white bg-gradient-to-br ${skill.color} shadow-md transition hover:scale-105`}
            >
              <div className="text-3xl mb-1">
                {skill.icon}
              </div>
              <p className="text-xs font-semibold">
                {skill.name}
              </p>
            </div>
          ))}
        </div>
      </section>

      {/* ================= EDUCATION ================= */}
      <section className="max-w-5xl mx-auto py-20 px-6">
        <h2 className="text-3xl font-bold text-center mb-12">
          Education
        </h2>

        <div className="space-y-6">
          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="font-semibold">
              B.Tech – CSE (E-Commerce Technology)
            </h3>
            <p>Vellore Institute of Technology, Bhopal • CGPA: 8.6</p>
          </div>

          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="font-semibold">Higher Secondary (HSC)</h3>
            <p>Shining Public School • 84.2%</p>
          </div>
        </div>
      </section>

            {/* ================= WORK EXPERIENCE ================= */}
      <section className="max-w-5xl mx-auto py-20 px-6">
        <h2 className="text-3xl font-bold text-center mb-12">
          Work Experience
        </h2>

        <div className="space-y-8">
          {/* Industrial Exposure */}
          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="text-xl font-semibold mb-2">
              Industrial Exposure
            </h3>
            <p className="text-sm text-gray-600 mb-2">
              T-Hub, T-Works, L&T Metro, BSNL • Hyderabad
            </p>
            <p className="text-gray-700 leading-relaxed">
              Gained exposure to startup ecosystems, prototyping labs,
              infrastructure operations, and telecom networks. Learned about
              real-world industrial workflows, innovation hubs, and large-scale
              operational systems.
            </p>
          </div>

          {/* Workshops & Sessions */}
          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="text-xl font-semibold mb-2">
              Workshops & Training Sessions
            </h3>
            <p className="text-sm text-gray-600 mb-2">
              I Medita – Industry Training & Skill Development Organization • Pune
            </p>
            <p className="text-gray-700 leading-relaxed">
              Participated in training sessions on AWS Cloud and Networking,
              gaining hands-on experience with cloud services, network
              configuration, and security concepts. Worked with tools such as
              AWS platform and Cisco Packet Tracer to understand real-world
              implementation of networking and cloud solutions.
            </p>
            <p className="text-gray-700 leading-relaxed mt-3">
              Attended an Entrepreneurship session by Milind Datar, Founder of
              CaneBOT, gaining insights into startup development, innovation,
              and real-world business challenges. Enhanced technical,
              analytical, and entrepreneurial skills through industry-expert
              interactions.
            </p>
          </div>
        </div>
      </section>


      {/* ================= PROJECTS ================= */}
      <section className="py-20 bg-gray-100">
        <h2 className="text-3xl font-bold text-center mb-12">
          Projects
        </h2>

        <div className="max-w-5xl mx-auto px-6 grid gap-6 md:grid-cols-2">
          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="font-semibold mb-2">
              Seven Wonders E-Commerce Website
            </h3>
            <p>
              Full-stack e-commerce platform inspired by the Seven Wonders of
              the World.
              Frontend: HTML, CSS, JavaScript, and frameworks like React or Angular. Backend: PHP, Python, Ruby, or Node.js
              Integrated Development Environment (IDE):Tools such as Visual Studio Code, JetBrains PhpStorm, or Sublime Text.
            </p>
          </div>

          <div className="p-6 bg-white rounded-xl shadow">
            <h3 className="font-semibold mb-2">
              Financial Advisor & Expense Tracker
            </h3>
            <p>
               Hardware Requirements: Server: Cloud-based hosting (AWS, Google Cloud) 
               User Devices: Compatible with Android, Web platforms
               Software Requirements: Programming Languages: HTML, CSS, TS (Frontend)
               Backend: MongoDb, Javascript API Integration: OpenAI

            </p>
          </div>
        </div>
      </section>

      {/* ================= CERTIFICATIONS ================= */}
            {/* ================= CERTIFICATIONS ================= */}
      <section className="py-24 bg-white">
        <h2 className="text-3xl font-bold text-center mb-14">
          Certifications
        </h2>

        <div className="max-w-3xl mx-auto px-6 space-y-6">
          {[
            "Deep Learning | IIT Ropar",
            "Industrial IoT in Markets and Security",
            "Deloitte Forage – Data Analysis Job Simulation",
          ].map((cert) => (
            <div
              key={cert}
              className="p-5 bg-gray-50 rounded-xl shadow hover:shadow-md transition"
            >
              <p className="text-lg font-medium text-gray-800">
                {cert}
              </p>
            </div>
          ))}
        </div>
      </section>


      {/* ================= CONTACT ================= */}
      <section className="py-20 text-center px-6">
        <h2 className="text-3xl font-bold mb-6">Contact</h2>

        <div className="flex justify-center gap-10 flex-wrap text-lg">
          <span className="flex items-center gap-2">
            <FaPhoneAlt /> +91 9131028961
          </span>
          <a className="flex items-center gap-2" href="https://www.linkedin.com/in/diksha-agrawal-92771a289">
            <FaLinkedin /> LinkedIn
          </a>
          <a className="flex items-center gap-2" href="https://github.com/dikagra123/DIKSHA-AGRAWAL">
            <FaGithub /> GitHub
          </a>
        </div>
      </section>

      <footer className="text-center py-6 border-t">
        © 2025 Diksha Agrawal | Portfolio
      </footer>
    </main>
  );
}
