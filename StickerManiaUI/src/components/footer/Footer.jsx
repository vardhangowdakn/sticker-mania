import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faHeart } from "@fortawesome/free-solid-svg-icons";

export default function Footer() {
  return (
    <footer className="flex justify-center items-center py-4 font-primary text-gray-700 dark:text-lighter animate-pulse">
      Buit with love
      <FontAwesomeIcon
        icon={faHeart}
        className="text-red-600 mx-1 animate-pulse "
        aria-hidden="true"
      />
      
     
    </footer>
  );
}