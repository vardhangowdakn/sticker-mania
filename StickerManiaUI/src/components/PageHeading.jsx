import React from "react";
import PageTitle from "./PageTitle";

export default function PageHeading({ title, children }) {
  return (
    <div className="text-center font-semibold text-3xl max-w-[576px] mx-auto px-4 py-6">
      <PageTitle title={title} />
      <p className="font-primary text-lg leading-6 text-gray-600 dark:text-lighter">{children}</p>
    </div>
  );
}